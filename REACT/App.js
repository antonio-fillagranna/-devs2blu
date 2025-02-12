import React, { useState, useEffect, createContext, useContext } from "react";
import { BrowserRouter as Router, Route, Routes, Link, useParams } from "react-router-dom";
import axios from "axios";
import "./App.css";

// Criando o contexto
const TaskContext = createContext();

const TaskProvider = ({ children }) => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    axios.get("https://jsonplaceholder.typicode.com/todos?_limit=10")
      .then((response) => setTasks(response.data))
      .catch((error) => console.error("Erro ao buscar tarefas:", error));
  }, []);

  const addTask = (title) => {
    const newTask = { id: Date.now(), title, completed: false };
    setTasks([...tasks, newTask]);
  };

  const toggleTask = (id) => {
    setTasks(tasks.map(task => task.id === id ? { ...task, completed: !task.completed } : task));
  };

  const deleteTask = (id) => {
    setTasks(tasks.filter(task => task.id !== id));
  };

  return (
    <TaskContext.Provider value={{ tasks, addTask, toggleTask, deleteTask }}>
      {children}
    </TaskContext.Provider>
  );
};

const useTasks = () => useContext(TaskContext);

const Header = () => (
  <header>
    <h1>Lista de Tarefas</h1>
    <nav>
      <Link to="/">Home</Link>
    </nav>
  </header>
);

const TaskForm = () => {
  const [title, setTitle] = useState("");
  const { addTask } = useTasks();

  const handleSubmit = (e) => {
    e.preventDefault();
    if (title.trim()) {
      addTask(title);
      setTitle("");
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="text" value={title} onChange={(e) => setTitle(e.target.value)} placeholder="Nova tarefa" />
      <button type="submit">Adicionar</button>
    </form>
  );
};

const TaskItem = ({ task }) => {
  const { toggleTask, deleteTask } = useTasks();

  return (
    <li>
      <span style={{ textDecoration: task.completed ? "line-through" : "none" }}>
        <Link to={`/task/${task.id}`}>{task.title}</Link>
      </span>
      <button onClick={() => toggleTask(task.id)}>✓</button>
      <button onClick={() => deleteTask(task.id)}>🗑</button>
    </li>
  );
};

const TaskList = () => {
  const { tasks } = useTasks();
  return (
    <ul>
      {tasks.map((task) => (
        <TaskItem key={task.id} task={task} />
      ))}
    </ul>
  );
};

const TaskDetail = () => {
  const { id } = useParams();
  const { tasks } = useTasks();
  const task = tasks.find((task) => task.id.toString() === id);
  if (!task) return <p>Tarefa não encontrada!</p>;
  return (
    <div>
      <h2>{task.title}</h2>
      <p>Status: {task.completed ? "Concluída" : "Pendente"}</p>
      <Link to="/">Voltar</Link>
    </div>
  );
};

const App = () => (
  <Router>
    <TaskProvider>
      <Header />
      <Routes>
        <Route path="/" element={
          <>
            <TaskForm />
            <TaskList />
          </>
        } />
        <Route path="/task/:id" element={<TaskDetail />} />
      </Routes>
    </TaskProvider>
  </Router>
);

export default App;
