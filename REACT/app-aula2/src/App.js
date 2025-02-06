import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import Menu from './componentes/menu'
import CadContato from './componentes/cadContato';
import ConsultaContato from './componentes/consultaContato';
import Home from './componentes/home';

function App() {
  return (
    <BrowserRouter>
      <Menu />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='cadastro' element={<CadContato />} />
        <Route path='consulta' element={<ConsultaContato/>} />
      </Routes>
    </BrowserRouter>
  );
}
export default App;
