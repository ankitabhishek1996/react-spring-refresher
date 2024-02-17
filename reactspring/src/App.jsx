import React, { useState } from 'react';
import axios from 'axios';

function UserInfoForm() {
    const [userInfo, setUserInfo] = useState({
        name: '',
        age: '',
        emailId: '',
        address: ''
    });

    const handleChange = (e) => {
        setUserInfo({...userInfo, [e.target.name]: e.target.value});
    }

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.post('http://localhost:8081/v1/save', userInfo);
            console.log(response.data);
            
        } catch (error) {
            console.error("There was an error!", error);
            
        }
    }

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" name="name" value={userInfo.name} onChange={handleChange} placeholder="Name" />
            <input type="number" name="age" value={userInfo.age} onChange={handleChange} placeholder="Age" />
            <input type="email" name="emailId" value={userInfo.emailId} onChange={handleChange} placeholder="Email" />
            <input type="text" name="address" value={userInfo.address} onChange={handleChange} placeholder="address" />
            <button type="submit">Submit</button>
        </form>
    );
}

export default UserInfoForm;
