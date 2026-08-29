select e.name as Employee from Employee e join Employee as e1 on e.managerId=e1.id AND e.salary>e1.salary;
