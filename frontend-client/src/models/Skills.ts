export interface Skill{
    id: number;
    name: string;
    proficiency: number;
    children?: Skill[];
}