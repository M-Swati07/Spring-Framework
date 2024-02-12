GET - http://localhost:3000/employee  
RESPONSE - [
    {
        "id": 1,
        "name": "William",
        "role": "Banker"
    },
    {
        "id": 2,
        "name": "Harry",
        "role": "Lawyer"
    },
    {
        "id": 3,
        "name": "Scott",
        "role": "Businessman"
    }
]

POST - http://localhost:3000/employee  
BODY - {
        "name": "Samuel",
        "role": "Youtuber"
}  
GET RESPONSE - [
    {
        "id": 1,
        "name": "William",
        "role": "Banker"
    },
    {
        "id": 2,
        "name": "Harry",
        "role": "Lawyer"
    },
    {
        "id": 3,
        "name": "Scott",
        "role": "Businessman"
    },
    {
        "id": 4,
        "name": "Samuel",
        "role": "Youtuber"
    }
]

PUT - http://localhost:3000/employee/2  
BODY - {
        "name": "Henry",
        "role": "Lawyer"
}  
RESPONSE - {
    "id": 2,
    "name": "Henry",
    "role": "Lawyer"
}

DELETE - http://localhost:3000/employee/4  
GET RESPONSE - [
    {
        "id": 1,
        "name": "William",
        "role": "Banker"
    },
    {
        "id": 2,
        "name": "Harry",
        "role": "Lawyer"
    },
    {
        "id": 3,
        "name": "Scott",
        "role": "Businessman"
    }
]
