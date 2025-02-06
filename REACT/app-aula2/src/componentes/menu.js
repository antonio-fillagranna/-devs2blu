import {Outlet, Link} from 'react-router-dom'
function Menu(){
    return(
        <>
        <nav className='navbar'>
            <ul className='navbar-nav list-inline'>
                <li className='navbar-item'>
                    <Link className='navbar-link' to="/">Home</Link>
                </li>
                <li className='navbar-item'>
                    <Link className='navbar-link' to="/cadastro">Cadastro</Link>
                </li>
                <li className='navbar-item'>
                    <Link className='navbar-link' to="/consulta">Consulta</Link>
                </li>
            </ul>
        </nav>
        <main>
            <Outlet />
        </main>
        </>
    )
}

export default Menu