import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import Menu from './componentes/menu'
import CadContato from './componentes/cadContato';
import ConsultaContato from './componentes/consultaContato';
import Home from './componentes/home';
import EditaContato from './componentes/editaContato';
function App() {
  return (
    <BrowserRouter>
       <Menu />
       <Routes>
          <Route path='/' element={<Home />} />
          <Route path='cadastro' element={<CadContato />} />
          <Route path='consulta' element={<ConsultaContato />} />
          <Route path='contato/:id' element={<EditaContato />} />
       </Routes> 
    </BrowserRouter>
  );
}

export default App;
