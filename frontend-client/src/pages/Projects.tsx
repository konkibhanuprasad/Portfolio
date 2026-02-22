import { useEffect, useState } from "react";
import axios from "axios";

const Projects = () => {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/api/projects")
      .then(res => setProjects(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div>
      <h1>Projects</h1>

      {projects.length === 0 ? (
        <p>No projects found</p>
      ) : (
        projects.map(project => (
          <div key={project}>
            <h3>{project}</h3>
          </div>
        ))
      )}
    </div>
  );
};

export default Projects;
