import React from 'react';
import ReactDOM from 'react-dom';

class Formulario extends React.Component {
  render() {
    return (
      <div className="shopping-list">
        <h1>Lista de Grupos</h1>
        <ul>
          <li>Instagram</li>
          <li>WhatsApp</li>
          <li>Oculus</li>
        </ul>
      </div>
    );
  }
}

export default Formulario;