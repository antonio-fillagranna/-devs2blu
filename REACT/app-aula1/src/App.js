import './App.css';
import CadastroUser from './componentes/cadastroUser';
import State from './componentes/state';

function App() {
  return (
    <div className="container">
          <header className='App-header'>Hello world</header>
          
      <main>
        <CadastroUser />
        <State />
      </main>
    </div>
  );
}

export default App;
