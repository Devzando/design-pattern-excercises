public abstract class ProcessadorTexto {
    public final String processarTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresProcessados = converterCaracteres(caracteres);
        String resultado = juntarCaracteresProcessados(caracteresProcessados);
        return resultado;
    }

    protected abstract char[] converterCaracteres(char[] chars);

    protected char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    protected String juntarCaracteresProcessados(char[] chars) {
        return new String(chars);
    }
}
