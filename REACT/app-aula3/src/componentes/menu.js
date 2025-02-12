import { Outlet, Link } from 'react-router-dom'
function Menu(){
    return(
        <>
        <nav className='navbar m-4'>
          <ul className='d-flex list-inline gap-4'>
            <li className="nav-item btn btn-outline-primary">
                <Link className='nav-link' to="/">Home</Link>
            </li>
            <li className="nav-item btn btn-outline-primary">
                <Link className='nav-link' to="/cadastro">Cadastro</Link>
            </li>
            <li className="nav-item btn btn-outline-primary">
               <Link className='nav-link' to="/consulta">Consulta</Link>
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