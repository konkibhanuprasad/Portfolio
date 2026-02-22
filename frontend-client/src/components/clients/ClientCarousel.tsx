import axios from "axios";
import { useEffect, useState } from "react";

interface Client{
    id: number;
    name: string;
    logo_url: string;
}

const ClientCarousel = () => {
    const [clients, setClients] = useState<Client[]>([]);

    useEffect(() => {
        axios.get("http://localhost:8080/api/clients").then(res => setClients(res.data));
    }, []);

    return (
        <div className="flex overflow-x-auto space-x-6 p-6">
            {clients.map(client => (
                <img
                key={client.id}
                src={client.logo_url}
                alt={client.name}
                className="h-16 object-contain"
                />
            ))}
        </div>
    )
}

export default ClientCarousel;