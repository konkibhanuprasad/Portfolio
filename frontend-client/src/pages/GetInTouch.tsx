import { useState } from "react"

const GetInTouch = () => {
    const [form, setForm] = useState({
        name:"",
        email:"",
        message:""
    });

    const handleSubmit = (e : React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        alert("message sbmitted (demo)");
    };

    return (<form onSubmit={handleSubmit} className="maz-w-md mx-auto p-6 space-y-4">
       <input type="text"
       placeholder="Name"
       className="w-full border p-2"
       onChange={e => setForm({...form, name: e.target.value})}
        />       
        <input type="email" 
        placeholder="Email"
        className="w-full boarder p-2"
        onChange={e => setForm({ ...form, email: e.target.value })} 
        /> 
        <textarea
        placeholder="Message"
        className="w-full border p-2"
        onChange={e => setForm({ ...form, message: e.target.value })}
        />
        <button className="bg-blue-500 text-white px-4 py-2 rounded">send</button>
        
    </form>
    );
};

export default GetInTouch;
