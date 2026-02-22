import { useEffect, useState } from "react";
import axios from "axios";
import SkillChart from "../components/SkillChart";
import { Skill } from "../models/Skills";

const Skills: React.FC = () => {

  const [skills, setSkills] = useState<Skill[]>([]);
  const [loading, setLoading] = useState<boolean>(true);

  useEffect(() => {
    axios.get<Skill[]>("http://localhost:8080/api/skills")
      .then(res => {
        setSkills(res.data);
        setLoading(false);
      })
      .catch(err => {
        console.error("Error fetching skills:", err);
        setLoading(false);
      });
  }, []);

  if (loading) {
    return <h2>Loading skills</h2>;
  }

  return (
    <div style={{ padding: "30px" }}>
      <h1>Skills Dashboard</h1>

      {/* Ranking + Progress Bars */}
      {skills.map((skill, index) => (
        <div key={skill.id} style={{ marginBottom: "20px" }}>
          <h4>#{index + 1} {skill.name}</h4>

          <div style={{
            background: "#ddd",
            height: "20px",
            borderRadius: "10px"
          }}>
            <div
              style={{
                width: skill.proficiency + "%",
                background: "#4CAF50",
                height: "100%",
                borderRadius: "10px",
                color: "white",
                textAlign: "center"
              }}
            >
              {skill.proficiency}%
            </div>
          </div>
        </div>
      ))}

      {/* Chart Section */}
      <SkillChart skills={skills} />
    </div>
  );
};

export default Skills;
