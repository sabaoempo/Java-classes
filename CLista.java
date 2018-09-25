/**
 * @(#)CLista.java
 *
 *
 * @author Rodrigo Richard Gomes
 * @version 1.00 2018/3/16
 */
 
public class CLista {
     
   private CCelula primeira;  // Referencia a cйlula cabeзa
   private CCelula ultima; // Referencia a ъltima cйlula da lista
   private int qtde; // Contador de itens na lista. Deve ser incrementado sempre que um item for inserido e decrementado quando um item for excluнdo.
     
   // Funзгo construtora. Aloca a cйlula cabeзa e faz todas as referкncias apontarem para ela.
   public CLista() {
      primeira = new CCelula();
      ultima = primeira;
   }
     
   // Verifica se a lista estб vazia. Retorna TRUE se a lista estiver vazia e FALSE se ela tiver elementos.
   public boolean vazia() {
      return primeira == ultima;
   }
     
   // Insere um novo Item no fim da lista.
   public void insereFim(Object valorItem) {
      ultima.prox = new CCelula(valorItem);
      ultima = ultima.prox;            
      qtde++;
   }
     
   // Insere um novo Item no comeзo da lista.
   public void insereComeco(Object valorItem) {
      primeira.prox = new CCelula(valorItem, primeira.prox);
      if (primeira.prox.prox == null)
         ultima = primeira.prox;
      qtde++;
   }
  
   // Insere o Item passado por parвmetro na posiзгo determinada.
   // O parвmetro "valorItem" й o item a ser inserido na lista.
   // O parвmetro "posicao" й a posiзгo na qual o elemento serб inserido. O primeiro elemento estб na posiзгo 1, e assim por diante.
   // Se a posiзгo existir e o mйtodo conseguir inserir o elemento, retorna TRUE. Caso a posiзгo nгo exista, retorna FALSE.
   public boolean insereIndice(Object valorItem, int posicao) {
      // Exercнcio
      return true;
   }
    
   // Imprime todos os elementos da lista usando o comando while 
   public void imprime() {
      CCelula aux = primeira.prox;
    
      while (aux != null) {
         System.out.println(aux.item);
         aux = aux.prox;
      }
   }
    
   // Imprime todos os elementos da lista usando o comando for 
   public void imprimeFor() {
      for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
         System.out.print(aux.item + " ");          
   }
    
   // Imprime todos os elementos simulando formato de lista: [/]->[7]->[21]->[13]->null 
   public void imprimeFormatoLista() {
      System.out.print("[/]->");
      for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
         System.out.print("[" + aux.item + "]->");
      System.out.println("null");
   }
    
   // Verifica se o elemento passado como parвmetro estб contido na lista.
   // O parвmetro "elemento" й o item a ser localizado. O mйtodo retorna TRUE caso o Item esteja presente na lista.
   public boolean contem(Object elemento) {
      boolean achou = false;
      CCelula aux = primeira.prox;
      while (aux != null && !achou) {
         achou = aux.item.equals(elemento);         
         aux = aux.prox;
      }         
      return achou;
   }
         
   // Verifica se o elemento passado como parвmetro estб contido na lista. (Obs: usando o comando FOR)
   // O parвmetro "elemento" й o item a ser localizado. O mйtodo retorna TRUE caso o Item esteja presente na lista.
   public boolean contemFor(Object elemento) {
      boolean achou = false;
      for (CCelula aux = primeira.prox; aux != null && !achou; aux = aux.prox)
         achou = aux.item.equals(elemento);
      return achou;
   }
 
   // Retorna um Object contendo o primeiro Item da lista. Se a lista estiver vazia a funзгo retorna null.
   public Object retornaPrimeiro() {
      if (primeira != ultima)
         return primeira.prox.item;
      else
         return null;
   }
 
   // Retorna um Object contendo o ъltimo Item da lista. Se a lista estiver vazia a funзгo retorna null.
   public Object retornaUltimo() {
      if (primeira != ultima)
         return ultima.item;
      else
         return null;
   }
 
   // Retorna o Item contido na posiзгo passada por parвmetro
   public Object retornaIndice(int posicao) {
      // EXERCНCIO : deve retornar o elemento da posiзгo p passada por parвmetro
      // [cabeзa]->[7]->[21]->[13]->null
      // retornaIndice(2) deve retornar o elemento 21. retornaIndice de uma posiзao inexistente deve retornar null.
      // Se й uma posiзгo vбlida e a lista possui elementos
      return null;
   }
    
   // Remove e retorna o primeiro item da lista (remoзгo fнsica, ou seja, elimina a cйlula que contйm o elemento).
   // Retorna um Object contendo o Item removido ou null caso a lista esteja vazia.
   public Object removeRetornaComeco() {
      // Verifica se hб elementos na lista
      if (primeira != ultima) {
         CCelula aux = primeira.prox;
         primeira.prox = aux.prox;
         if (primeira.prox == null) // Se a cйlula cabeзa estб apontando para null, significa que o ъnico elemento da lista foi removido
            ultima = primeira;
         qtde--;
         return aux.item;
      }
      return null;
   }
     
   // Remove e retorna o primeiro item da lista (remoзгo lуgica, ou seja, remove a cйlula cabeзa fazendo com que a cйlula seguinte ela se torne a nova cйlula cabeзa).
   // Retorna um Object contendo o item removido ou null caso a lista esteja vazia.
   public Object removeRetornaComecoSimples() {
      // Verifica se hб elementos na lista
      if (primeira != ultima) {
         primeira = primeira.prox;
         qtde--;
         return primeira.item;
      }
      return null;
   }
 
   // Remove o primeiro item da lista fazendo com que a cйlula seguinte а cйlula cabeзa se torne a nova cйlula cabeзa. Nгo retorna o item removido.
   public void removeComecoSemRetorno() {
      if (primeira != ultima) {
         primeira = primeira.prox;
         qtde--;
      }
   }
     
   // Remove o ъltimo Item da lista.
   // Retorna um Object contendo o Item removido ou null caso a lista esteja vazia.
   public Object removeRetornaFim() {
      if (primeira != ultima) {
         CCelula aux = primeira;
         while (aux.prox != ultima)
            aux = aux.prox;      
         CCelula aux2 = aux.prox;
         ultima = aux;
         ultima.prox = null;
         qtde--;
         return aux2.item;
      }
      return null;
   }
 
   // Remove o ъltimo Item da lista sem retornб-lo.
   public void removeFimSemRetorno() {
      if (primeira != ultima) {
         CCelula aux = primeira;
         while (aux.prox != ultima)
            aux = aux.prox;      
         ultima = aux;
         ultima.prox = null;
         qtde--;
      }
   }
 
   // Localiza o Item passado por parвmetro e o remove da Lista
   // O parвmetro "valorItem" й o item a ser removido da lista.
   public void remove(Object valorItem) {
      if (primeira != ultima) {
         CCelula aux = primeira;
         boolean achou = false;
         while (aux.prox != null && !achou) {
            achou = aux.prox.item.equals(valorItem);
            if (!achou)
               aux = aux.prox;
         }
         if (achou) { 
            // achou o elemento
            aux.prox = aux.prox.prox;
            if (aux.prox == null)
               ultima = aux;
            qtde--;
         }
      }
   }
 
   // Remove o elemento na posiзгo passada como parвmetro.
   // O parвmetro "posicao" й a posiзгo a ser removida. OBS: o primeiro elemento estб na posiзгo 1, e assim por diante.
   // O mйtodo retorna TRUE se a posiзгo existe e foi removida com sucesso, e FALSE caso a posiзгo nгo exista.
   public boolean removeIndice(int posicao) {
      // Verifica se й uma posiзгo vбlida e se a lista possui elementos
      if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
         int i = 0;
         CCelula aux = primeira;
         while (i < posicao - 1) {
            aux = aux.prox;
            i++;
         }
         aux.prox = aux.prox.prox;
         if (aux.prox == null)
            ultima = aux;
         qtde--;
         return true;
      }
      return false;
   }
 
   // Remove e retorna o elemento na posiзгo passada como parвmetro.
   // O parвmetro "posicao" й a  posiзгo a ser removida. OBS: o primeiro elemento estб na posiзгo 1, e assim por diante.
   // O mйtodo retorna um object contendo o elemento removido da lista. Caso a posiзгo seja invбlida, retorna null.
   public Object removeRetornaIndice(int posicao) {
      // Verifica se й uma posiзгo vбlida e se a lista possui elementos
      if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
         int i = 0;
         CCelula aux = primeira;
         while (i < posicao - 1) {
            aux = aux.prox;
            i++;
         }
         CCelula aux2 = aux.prox;
         aux.prox = aux.prox.prox;
         if (aux.prox == null)
            ultima = aux;
         qtde--;
         return aux2.item;
      }
      return null;
   }
 
   	public void InsereAntesDe(Object ElementoAInserir, Object Elemento) {
   		CCelula aux = new CCelula(ElementoAInserir);
   		aux = primeira;
   		if (primeira != ultima) {
   			while(aux.prox != Elemento) {
   	   			aux.prox = aux.prox.prox;
   	   		}
   	   		if (aux.prox == Elemento) {
   	   			CCelula aux2 = aux.prox.prox;
   	   			aux.prox = aux;
   	   			aux = aux2;
   	   		}
   		}
   		
   	}
   	
   	public void InsereDepoisDe(Object ElementoAInserir, Object Elemento) {
   		
   	}
   // Mйtodo(getter) que retorna a quantidade de itens da lista.
   public int quantidade() {
      return qtde;
   }
 
}