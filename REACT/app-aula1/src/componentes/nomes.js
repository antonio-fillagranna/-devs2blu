function Nomes({nomes}){
    return(
        <ul>
        { nomes.map((n) => <li>{n}</li>) }
        </ul>
    )
}
export default Nomes