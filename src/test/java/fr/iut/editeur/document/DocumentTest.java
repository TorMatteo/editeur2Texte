package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {


    private Document document = new Document();

    @Test
    public void testConstructeur() {
        assertEquals("", document.getTexte());
    }

    @Test
    public void testSetTexte() {
        document.setTexte("Hello");
        assertEquals("Hello", document.getTexte());
    }

    @Test
    public void testAjouter() {
        document.ajouter("Hello");
        document.ajouter(" World");
        assertEquals("Hello World", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        document.setTexte("Hello World");
        document.remplacer(0, 4, "Bonjour");
        assertEquals("Bonjour World", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        document.setTexte("hello world");
        document.majuscules(0, 4);
        assertEquals("HELLO world", document.getTexte());
    }

    @Test
    public void testEffacer() {
        document.setTexte("Hello World");
        document.effacer(5, 10);
        assertEquals("Hello", document.getTexte());
    }

    @Test
    public void testClear() {
        document.setTexte("Hello World");
        document.clear();
        assertEquals("", document.getTexte());
    }

    @Test
    public void testToString() {
        document.setTexte("Hello World");
        assertEquals("Hello World", document.toString());
    }

}