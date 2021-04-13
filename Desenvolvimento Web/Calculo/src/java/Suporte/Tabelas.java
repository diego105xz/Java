package Suporte;

public class Tabelas {
    String html="";
    
    public void Imc(){
        html+= "Tabela IMC";
        html+= "<p>A Organização Mundial de Saúde utiliza a seguinte tabela de peso ideal pelo IMC:</p>";
        html+= "<div align=\"left\">";
        html+= "   <table border=\"1\" cellpadding=\"10\" width=\"300\" cellspacing=\"1\">";
        html+= "        <tr><td><b>Situação</b></td>      <td><b>IMC em adultos</b></td></tr>";
        html+= "        <tr><td>abaixo do peso ideal</td>   <td>abaixo de 18,5</td></tr>";
        html+= "        <tr><td>no peso ideal</td>              <td>entre 18,5 e 25</td></tr>";
        html+= "        <tr><td>acima do peso ideal</td>     <td>entre 25 e 30</td></tr>";
        html+= "        <tr><td>obeso</td>                        <td>acima de 30</td></tr>";
        html+= "   </table>";
        html+= "</div>";
        html+= "<p>Esta tabela da da Organização Mundial de Saúde tem vantagem de ser simples e fácil de usar com números redondos.</p>";
    }
    public String getImc(){
        Imc();
        return html;
    }
    public String CalculoImc(float peso, float altura){
        float imc = 0;
        imc = peso / (altura*altura);
        return "IMC = " + String.format("%.2f",imc);
    }
    
}
