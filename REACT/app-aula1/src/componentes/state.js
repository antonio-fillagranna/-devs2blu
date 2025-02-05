import { useRef, useEffect, useState } from 'react';
import Botao from './botao';
import Nomes from './nomes';

function State() {
    const [nome, setNome] = useState("Maria");
    const [nomes, setNomes] = useState(['ana', 'maria']); // Mudei para useState
    const nomeRef = useRef(null)

    useEffect(() => {
        console.log(nomes);
    }, [nomes]); // Adicionei um useEffect para monitorar mudanças no array 'nomes'

    function adicionaNome() {
        if (nome == ''){
            alert('O nome deve ser informado')
            nomeRef.current.focus()
            return
        }
        setNomes([...nomes, nome]); // Atualiza o estado de 'nomes'
        setNome(''); // Limpa o campo de input após adicionar o nome
    }

    function handleKeyDown(event) {
        if (event.key === 'Enter') {
            adicionaNome();
        }
        if (event.key === 'Backspace') {
            limpaNomes();
        }
    }

    function limpaNomes() {
        setNomes([]); // Redefine o estado de 'nomes' para um array vazio
    }

    return (
        <div className="container mt-5">
            <input className="container mt-5"
                type="text"
                value={nome}
                onChange={(e) => setNome(e.target.value)}
                onKeyDown={handleKeyDown} // Adicionei o evento onKeyDown aqui
                ref={nomeRef}
            />
            <button onClick={adicionaNome}>Adicionar Nome</button>
            <button onClick={limpaNomes}>Limpar Nomes</button> {/* Botão para limpar nomes */}
            <ul>
                {nomes.map((nome, index) => (
                    <li key={index}>{nome}</li>
                ))}
            </ul>
        </div>
    );
}

export default State;
