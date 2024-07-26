class Heroi {
    constructor(nome, idade, tipo) {
      this.nome = nome;
      this.idade = idade;
      this.tipo = tipo;
    }
  
    atacar() {
      let ataque;
      if (this.tipo === "mago") {
        ataque = "usou magia";
      } else if (this.tipo === "guerreiro") {
        ataque = "usou espada";
      } else if (this.tipo === "monge") {
        ataque = "usou artes marciais";
      } else if (this.tipo === "ninja") {
        ataque = "usou shuriken";
      } else {
        ataque = "";
      }
      console.log(`O ${this.tipo} atacou usando ${ataque}`);
    }
  }
  const mago = new Heroi("Gandalf", 1000, "mago");
  const guerreiro = new Heroi("Aragorn", 87, "guerreiro");
  const monge = new Heroi("Po", 20, "monge");
  const ninja = new Heroi("Naruto", 17, "ninja");
  
  mago.atacar(); // Exibe: "O mago atacou usando magia"
  guerreiro.atacar(); // Exibe: "O guerreiro atacou usando espada"
  monge.atacar(); // Exibe: "O monge atacou usando artes marciais"
  ninja.atacar(); // Exibe: "O ninja atacou usando shuriken"
    