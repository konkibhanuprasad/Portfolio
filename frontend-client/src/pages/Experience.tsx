import { motion } from "framer-motion";
import axios from "axios";
import { useEffect, useState } from "react";

interface Employemnt {
    id: number;
    company: string;
    role: string;
    startDate: string;
    endDate: string;
    ifCurrent: string;
    
}

const Experince = () =>{
    const[jobs, setJobs] = useState<Employemnt[]>([]);

    useEffect(() => {
        axios.get("http://localhost:8080/api/employement")
        .then(res => setJobs(res.data));
    }, []);

    return (
        <div className="p-6 space-y-6">
            {jobs.map(job => (
                <motion.div
                key={job.id}
                initial ={{opacity: 0, x: -50}}
                animate={{opacity: 1, x: 0}}
                transition={{duration: 0.5}}
                className="border-l-4 border-blue-500 pl-4"
                >
                    <h3 className="font-bold">{job.company}</h3>
                    <p>{job.role}</p>
                    <p className="text-gray-400">
                        {job.startDate}-{job.endDate}
                    </p>
                </motion.div>
            ))}
        </div>
    )
}

export default Experince;