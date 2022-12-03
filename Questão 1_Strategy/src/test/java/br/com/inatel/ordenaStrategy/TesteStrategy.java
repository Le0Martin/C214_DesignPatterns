package br.com.inatel.ordenaStrategy;
import br.com.inatel.ordenaStrategy.ordena.impl.Bubble;
import br.com.inatel.ordenaStrategy.ordena.impl.Insertion;
import br.com.inatel.ordenaStrategy.ordena.impl.Selection;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteOrdenacao {

    SelecionadorDeOrdenacao selecionadorDeOrdenacao;
    ArrayList<Integer> unsortedList = new ArrayList<>();
    ArrayList<Integer> sortedList = new ArrayList<>();

    @Before
    public void init(){
        unsortedList.add(15);
        unsortedList.add(5);
        unsortedList.add(1);
        unsortedList.add(44);
        unsortedList.add(72);
        unsortedList.add(540);
        unsortedList.add(-3);
        unsortedList.add(-22);

        sortedList.add(-22);
        sortedList.add(-3);
        sortedList.add(12);
        sortedList.add(5);
        sortedList.add(15);
        sortedList.add(44);
        sortedList.add(72);
        sortedList.add(540);
    }

    @Test
    public void testInsertionSort(){
        selecionadorDeOrdenacao = new InsertionSort();

        ArrayList<Integer> newSortedList = selecionadorDeOrdenacao.sortList(unsortedList);

        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Insertion);
        assertEquals(newSortedList, sortedList);
    }
    
    @Test
    public void testSelectionSort(){
        selecionadorDeOrdenacao = new SelectionSort();

        ArrayList<Integer> newSortedList = selecionadorDeOrdenacao.sortList(unsortedList);

        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Selection);
        assertEquals(newSortedList, sortedList);
    }

    @Test
    public void testBubbleSort(){
        selecionadorDeOrdenacao = new BubbleSort();

        ArrayList<Integer> newSortedList = selecionadorDeOrdenacao.sortList(unsortedList);

        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Bubble);
        assertEquals(newSortedList, sortedList);
    }



    @Test
    public void testChangingTheSortType() {
        selecionadorDeOrdenacao = new BubbleSort();

        selecionadorDeOrdenacao = new SelectionSort();
        assertTrue(selecionadorDeOrdenacao.getOrdenador() instanceof Selection);
    }

}
