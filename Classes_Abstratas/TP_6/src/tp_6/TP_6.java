package tp_6; // Declara o pacote onde o arquivo está localizado
  // Gabriel Alexandre Silva 2023101421
import java.util.Scanner; // Importa a classe Scanner para capturar entradas do usuário pelo console

// Classe abstrata Forma
abstract class Forma {
    // Declaração de método abstrato para calcular a área
    public abstract double calcArea();
    // Declaração de método abstrato para calcular o perímetro
    public abstract double calcPerimetro();
}

// Subclasse Círculo que herda de Forma
class Circulo extends Forma {
    private double raio; // Atributo que representa o raio do círculo

    // Construtor para inicializar o raio
    public Circulo(double raio) {
        this.raio = raio; // Atribui o valor do raio ao atributo
    }

    // Implementação do método abstrato calcArea para calcular a área do círculo
    @Override
    public double calcArea() {
        return Math.PI * Math.pow(raio, 2); // Fórmula da área do círculo: π * raio²
    }

    // Implementação do método abstrato calcPerimetro para calcular o perímetro do círculo
    @Override
    public double calcPerimetro() {
        return 2 * Math.PI * raio; // Fórmula do perímetro do círculo: 2 * π * raio
    }
}

// Subclasse Quadrado que herda de Forma
class Quadrado extends Forma {
    private double lado; // Atributo que representa o lado do quadrado

    // Construtor para inicializar o lado
    public Quadrado(double lado) {
        this.lado = lado; // Atribui o valor do lado ao atributo
    }

    // Implementação do método abstrato calcArea para calcular a área do quadrado
    @Override
    public double calcArea() {
        return lado * lado; // Fórmula da área do quadrado: lado²
    }

    // Implementação do método abstrato calcPerimetro para calcular o perímetro do quadrado
    @Override
    public double calcPerimetro() {
        return 4 * lado; // Fórmula do perímetro do quadrado: 4 * lado
    }
}

// Subclasse Triângulo que herda de Forma
class Triangulo extends Forma {
    // Atributos para base, altura e os três lados do triângulo
    private double base;
    private double altura;
    private double ladoA, ladoB, ladoC;

    // Construtor para inicializar os atributos do triângulo
    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base; // Define o valor da base
        this.altura = altura; // Define o valor da altura
        this.ladoA = ladoA; // Define o valor do lado A
        this.ladoB = ladoB; // Define o valor do lado B
        this.ladoC = ladoC; // Define o valor do lado C
    }

    // Implementação do método abstrato calcArea para calcular a área do triângulo
    @Override
    public double calcArea() {
        return (base * altura) / 2; // Fórmula da área do triângulo: (base * altura) / 2
    }

    // Implementação do método abstrato calcPerimetro para calcular o perímetro do triângulo
    @Override
    public double calcPerimetro() {
        return ladoA + ladoB + ladoC; // Soma dos lados para calcular o perímetro
    }
}

// Classe principal para executar o programa
public class TP_6 {
    public static void main(String[] args) {
        // Inicializa o Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o raio do círculo
        System.out.print("Insere o raio do circulo: ");
        double raio = scanner.nextDouble(); // Lê o valor do raio
        Forma circulo = new Circulo(raio); // Cria um objeto da classe Circulo
        // Exibe a área e o perímetro do círculo
        System.out.println("Circulo -> AreaArea: " + circulo.calcArea() + ", Perimetro: " + circulo.calcPerimetro());

        // Solicita ao usuário o lado do quadrado
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble(); // Lê o valor do lado
        Forma quadrado = new Quadrado(lado); // Cria um objeto da classe Quadrado
        // Exibe a área e o perímetro do quadrado
        System.out.println("Quadrado -> Area: " + quadrado.calcArea() + ", Perimetro: " + quadrado.calcPerimetro());

        // Solicita ao usuário os valores do triângulo
       
        System.out.print("Insere a base do triangulo: ");
        double base = scanner.nextDouble(); // Lê o valor da base
        System.out.print("Insere a altura do triangulo: ");
        double altura = scanner.nextDouble(); // Lê o valor da altura
        System.out.print("Insere o lado A do triangulo: ");
        double ladoA = scanner.nextDouble(); // Lê o valor do lado A
        System.out.print("Insere o lado B do triangulo: ");
        double ladoB = scanner.nextDouble(); // Lê o valor do lado B
        System.out.print("Insere o lado C do triangulo: ");
        double ladoC = scanner.nextDouble(); // Lê o valor do lado C
        Forma triangulo = new Triangulo(base, altura, ladoA, ladoB, ladoC); // Cria um objeto da classe Triangulo
        // Exibe a área e o perímetro do triângulo
        System.out.println("triangulo -> Area: " + triangulo.calcArea() + ", Perimetro: " + triangulo.calcPerimetro());

        scanner.close(); // Fecha o Scanner para liberar recursos
    }
}
// classe abstrata 
//Métodos abstratos: Métodos sem implementação, que precisam ser obrigatoriamente implementados pelas classes que herdam dela.
//Métodos concretos: Métodos com implementação, que podem ser usados diretamente pelas subclasses.