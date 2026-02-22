import axios from "axios" ;
import { Project } from "../models/Project";

const API_URL = "http://localhost:8080/api/projects";

export const fetchProjects = async (): Promise<Project[]> => {
    const response = await axios.get(API_URL);
    return response.data;
};