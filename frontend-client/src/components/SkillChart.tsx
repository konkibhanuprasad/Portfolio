import {
    Chart as ChartJS,
    CategoryScale,
    LinearScale,
    BarElement,
    Title,
    Tooltip,
    Legend
} from "chart.js";
import { Bar } from "react-chartjs-2";
import { Skill } from "../models/Skills";

ChartJS.register(
    CategoryScale,
    LinearScale,
    BarElement,
    Title,
    Tooltip,
    Legend
);
interface Props{
    skills: Skill[];
}

const SkillChart: React.FC<Props> = ({ skills }) =>{

    const data = {
        lables: skills.map(skills => skills.name),
        datasets: [{
            label: "proficiency",
            data: skills.map(skills => skills.proficiency),
            backgroundColor: "rgba(54, 162, 235, 0.6)"
        }]
    };

    return (
        <div style={{ marginTop: "40px"}}>
        <h2>Skill Analyst</h2>
        <Bar data={data}></Bar>
        </div>
    );
};

export default SkillChart;