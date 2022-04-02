public class App {
    public static void main(String[] args) throws Exception {

        // listas iniciais declaradas e instanciada com 5 elementos
        int src1[] = {1,2,3,4,5};
        int src2[] = {6,7,8,9,10};

        ////////////////////////////////////////////////////////////////////////////
        // Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;
        ///////////////////////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 1_____________________");

        int[] lista = new int[5];

        System.out.println("\nPreenchendo uma lista com os valores de 1 a 5:");
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = src1[i];
            System.out.printf("%d%s", lista[i], "\n");
        }

        ///////////////////////////////////////////////////////////
        // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. 
        // Deve-se sempre remover os dados da célula inicial da lista; 
        //////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 2_____________________");
        // cria uma pilha com 5 elmentos
        Stack pilha = new Stack(5);

        //preenche a pilha com os elementos da lista
        for (int i = 0; i < lista.length; i++) {
            pilha.push(lista[i]);
            System.out.println("Inserindo o elemento " + lista[i] + " na Pilha");

            // remove os dados da lista
            lista[i] = 0; 
        }

        System.out.println("\nA Pilha foi preenchida:");
        pilha.printStack();

        System.out.println("\n\n______________________________________");
        System.out.println("\nA lista inicial agora está vazia:");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%d%s", lista[i], "\n");
        }

        //////////////////////////////////////////////////////////
        // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
        //////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 3_____________________");
        // instancia uma fila do tipo Linked List
        LinkedList fila = new LinkedList();

        for (int i = 0; i < lista.length; i++) {
            LinkedList.insert(fila, pilha.peek());
            System.out.println("Inserindo o elemento " + pilha.peek() + " na fila");
            pilha.pop();
        }

        //imprimindo a Fila com os elementos preenchidos
        LinkedList.printList(fila);


        //////////////////////////////////////////////////////////
        // Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
        //////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 4_____________________");

        System.out.println("\nPreenchendo uma lista com os valores de 6 a 10:");

        for (int i = 0; i < lista.length; i++) {
            lista[i] = src2[i];
            System.out.printf("%d%s", lista[i], "\n");
        }

        //////////////////////////////////////////////////////////
        // Passo 5: Repita os passos 2 e 3.
        // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. 
        // Deve-se sempre remover os dados da célula inicial da lista; 
        //////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 5.2___________________");
        // cria uma pilha com 5 elmentos
        Stack pilha2 = new Stack(5);

        // preenche a pilha com os elementos da lista
        for (int i = 0; i < lista.length; i++) {
            pilha2.push(lista[i]);
            System.out.println("Inserindo o elemento " + lista[i] + " na Pilha2");

            // remove os dados da lista
            lista[i] = 0;
        }

        System.out.println("\nA Pilha2 foi preenchida:");
        pilha2.printStack();

        System.out.println("\n\n______________________________________");
        System.out.println("\nA lista inicial agora está vazia:");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%d%s", lista[i], "\n");
        }

        //////////////////////////////////////////////////////////
        // Passo 5: Repita os passos 2 e 3.
        // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);
        //////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 5.2___________________");
        // instancia uma fila do tipo Linked List
        // LinkedList fila2 = new LinkedList();

        for (int i = 0; i < lista.length; i++) {
            LinkedList.insert(fila, pilha2.peek());
            System.out.println("Inserindo o elemento " + pilha2.peek() + " na fila");
            pilha2.pop();
        }
 
        //////////////////////////////////////////////////////////
        // Passo 6: Exiba todos os números que foram inseridos na fila. 
        //////////////////////////////////////////////////////////
        System.out.println("\n\n_________________PASSO 6_____________________");
        // imprimindo a Fila com os elementos preenchidos
        LinkedList.printList(fila);

    }
}
