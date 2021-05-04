package Suporte;

public class Tabelas {
    
    String html = "";
    
    private void Imc(){     
        // https://www.copacabanarunners.net/tabela-peso-ideal-imc.html
        html += "TABELA IMC";
        html += "<p>A Organização Mundial de Saúde utiliza a seguinte tabela de peso ideal pelo IMC:</p>";
        html += "<div align=\"left\">";
        html += "    <table border=\"1\" cellpadding=\"10\" width=\"300\" cellspacing=\"1\">";
        html += "        <tr><td><b>Situação</b></td>      <td><b>IMC em adultos</b></td></tr>";
        html += "        <tr><td>abaixo do peso ideal</td>   <td>abaixo de 18,5</td></tr>";
        html += "        <tr><td>no peso ideal</td>              <td>entre 18,5 e 25</td></tr>";
        html += "        <tr><td>acima do peso ideal</td>     <td>entre 25 e 30</td></tr>";
        html += "        <tr><td>obeso</td>                        <td>acima de 30</td></tr>";
        html += "    </table>";
        html += "</div>";
        html += "<p>Esta tabela da da Organização Mundial de Saúde tem vantagem de ser simples e fácil de usar com números redondos.</p>";
    }
    
    public String getImc(){
        Imc();
        return html;
    } 
    
    public String CalculoImc(float peso, float altura){
        float imc=0;
        imc = peso / (altura * altura);
        return "IMC = " + String.format("%.2f", imc);
    }


    public String nivel_Imc(int inicio, int tam){
                //  para imprimir:      out.print(new Tabelas().nivel_Imc() );
                String result = "";
                int nivelIMC[] = {10, 12, 13, 14, 15, 17, 18, 25, 30, 31, 42, 51, 60};
                
                for(int i = inicio; i < (inicio+tam); i++){
                    result += "<br>Valor "+ (i+1) + " = " + nivelIMC[i];
                }
                result += "<br><br>";
                return result;
    }
    
    public String nivel_Imc(){
                String result = "";
                int nivelIMC[][] = {
                    {18, 5, 2},
                    {19, 7, 1},
                    {25, 12, 3}
                };
                
                for(int i = 0; i < 3 ; i++){
                    result += "<br>";
                    for(int j = 0; j < 3 ; j++){
                          result += nivelIMC[i][j] + "    ";
                    }
                }
                result += "<br><br>";
                return result;
    }
           
        public String nivel_Imc(int inicio){
                String result = "";
                int nivelIMC[] = {10, 12, 13, 14, 15, 17, 18, 25, 30, 31, 42, 51, 60};
                
                for(int i = inicio; i < nivelIMC.length; i++){
                    result += "<br>Valor "+ (i+1) + " = " + nivelIMC[i];
                }
                result += "<br><br>";
                return result;
        }
    
}
