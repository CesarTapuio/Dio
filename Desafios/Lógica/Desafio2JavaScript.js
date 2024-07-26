// Função para calcular o nível do jogador com base nas vitórias e derrotas
function calcularNivel(vitorias, derrotas) {
    let saldoVitorias = vitorias - derrotas;
    let nivel;
  
    if (vitorias < 10) {
      nivel = "Ferro";
    } else if (vitorias >= 10 && vitorias <= 20) {
      nivel = "Bronze";
    } else if (vitorias >= 21 && vitorias <= 50) {
      nivel = "Prata";
    } else if (vitorias >= 51 && vitorias <= 80) {
      nivel = "Ouro";
    } else if (vitorias >= 81 && vitorias <= 90) {
      nivel = "Diamante";
    } else if (vitorias >= 91 && vitorias <= 100) {
      nivel = "Lendário";
    } else if (vitorias >= 101) {
      nivel = "Imortal";
    }
  
    return { saldoVitorias, nivel };
  }
  
  // Chamar a função com as vitórias e derrotas do jogador
  let resultado = calcularNivel(120, 30);
  
  // Exibir a mensagem com o saldo de vitórias e o nível do jogador
  console.log("O Herói tem de saldo de " + resultado.saldoVitorias + " está no nível de " + resultado.nivel);
  