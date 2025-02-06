import { useState } from "react"
import { useNavigate } from "react-router-dom"

function CadContato(){
    const [nome, setNome] = useState('')
    const [email, setEmail] = useState('')
    const [telefone, setTelefone] = useState('')

    const navigate = useNavigate()
    
    function AddContato(){
        const contato = {nome, email, telefone}
        fetch('http://localhost:3000/contatos',
        {
            method: 'POST',
            headers:{'ContentType':'application/json'},
            body:JSON.stringify(contato)
        })
        navigate('/consulta')
    }
    return(
        <div className="container">
            <h2 className="text-center m-4">Novo contato</h2>
            <form>
                <label className="control-form">Informe nome</label>
                <input className="form-control mb-2" type="text" placeholder="Informe nome" value={nome} onChange={(e)=> setNome(e.target.value)} />

                <label className="control-form">Informe email</label>
                <input className="form-control mb-2" type="text" placeholder="Informe nome" value={email} onChange={(e)=> setEmail(e.target.value)} />

                <label className="control-form">Informe telefone</label>
                <input className="form-control mb-2" type="text" placeholder="Informe telefone" value={telefone} onChange={(e)=> setTelefone(e.target.value)} />

                <div className="mt-4 d-flex justify-content-between">
                    <button className="btn btn-outline-primary" onClick={AddContato}>Gravar</button>
                    <button className="btn btn-outline-warning">Cancelar</button>
                </div>
            </form>
        </div>
    );
}

export default CadContato