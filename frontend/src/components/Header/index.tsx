import logosvg from "../../assets/img/logo.svg"
import './styles.css'

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logosvg} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>Desenvolvido por
          <a href="https://www.instagram.com/devsuperior.ig/">
            <b> @devsuperior.ig </b></a>
          e
          <a href="https://github.com/GersonRibeiro168/">
            <b> GersonRibeiro168</b></a>
        </p>
      </div>
    </header>
  )
}

export default Header