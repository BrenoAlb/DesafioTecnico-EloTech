package exercicios;

public class Exercicio4 {
    public static void Exercicio4() {
        String sqlA = "SELECT * FROM Compras WHERE IDCliente IN (SELECT ID FROM Cliente WHERE Nome = 'Pedro');";
        String sqlB = "SELECT Compras.*, Cliente.* FROM Compras JOIN Cliente ON Compras.IDCliente = Cliente.ID WHERE YEAR(Compras.DataCompra) = 2018;";
        String sqlC = "SELECT IDCompra, COUNT(IDProduto) AS QuantidadeItens FROM ItemCompra GROUP BY IDCompra HAVING COUNT(IDProduto) > 1;";
        String sqlD = "SELECT * FROM Produto WHERE NOT EXISTS (SELECT 1 FROM ItemCompra JOIN Compras ON ItemCompra.IDCompra = Compras.ID WHERE ItemCompra.IDProduto = Produto.ID AND YEAR(Compras.DataCompra) = 2018);";

        System.out.println(STR."SQL para a questão a): \{sqlA}");
        System.out.println(STR."SQL para a questão b): \{sqlB}");
        System.out.println(STR."SQL para a questão c): \{sqlC}");
        System.out.println(STR."SQL para a questão d): \{sqlD}");
    }
}
