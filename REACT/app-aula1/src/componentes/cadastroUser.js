import { useRef, useEffect, useState } from 'react';
import Botao from './botao';

function CadastroUser() {
    const [nome, setNome] = useState("");
    const [email, setEmail] = useState("");
    const [fone, setFone] = useState("");
    const [usuarios, setUsuarios] = useState([]);
    const nomeRef = useRef(null);

    useEffect(() => {
        console.log(usuarios);
    }, [usuarios]);

    function adicionaUsuario() {
        if (nome === '' || email === '' || fone === '') {
            alert('Todos os campos devem ser informados');
            nomeRef.current.focus();
            return;
        }
        setUsuarios([...usuarios, { nome, email, fone }]);
        setNome(''); 
        setEmail(''); 
        setFone('');
    }

    function handleKeyDown(event) {
        if (event.key === 'Enter') {
            adicionaUsuario();
        }
        if (event.key === 'Backspace') {
            limpaUsuarios();
        }
    }

    function limpaUsuarios() {
        setUsuarios([]);
    }

    return (
        <div className="container mt-5">
            <h2>Cadastro de Usuários</h2>
            <input
                type="text"
                value={nome}
                onChange={(e) => setNome(e.target.value)}
                onKeyDown={handleKeyDown} 
                placeholder="Informe nome"
                ref={nomeRef}
                className="form-control mb-2"
            />
            <input
                type="text"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                onKeyDown={handleKeyDown} 
                placeholder="Informe email"
                className="form-control mb-2"
            />
            <input
                type="text"
                value={fone}
                onChange={(e) => setFone(e.target.value)}
                onKeyDown={handleKeyDown} 
                placeholder="Informe telefone"
                className="form-control mb-2"
            />
            <button onClick={adicionaUsuario} className="btn btn-primary">Adicionar Usuário</button>
            <button onClick={limpaUsuarios} className="btn btn-danger">Limpar Usuários</button>

            <table className="table mt-4">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Fone</th>
                    </tr>
                </thead>
                <tbody>
                    {usuarios.map((usuario, index) => (
                        <tr key={index}>
                            <td>{usuario.nome}</td>
                            <td>{usuario.email}</td>
                            <td>{usuario.fone}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default CadastroUser;
