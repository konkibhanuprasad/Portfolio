import { Project } from "../../models/Project";

interface Props{
    project : Project;
}

const ProjectCard: React.FC<Props> = ({ project }) => {
    return (
        <div className="bg-white shadow-lg rounded-xl p-5 hover:scale-205 transition">
            <h3 className="text-xl font-semibold">{project.title}</h3>
            <p className="text-gray-600 mt-2">{project.description}</p>
            <p className="text-sm text-gray-400 mt-2">{project.createdAt}</p>
            <p className="text-blue-500 mt-2">{project.clientName}</p>
        </div>
    );
};

export default ProjectCard;