# Documentação do Projeto -- Contador Android

## 1. Descrição

Este projeto é um aplicativo Android simples desenvolvido em **Java**
utilizando **Android Studio**.\
O aplicativo funciona como um **contador**, permitindo que o usuário
aumente ou diminua um valor através de botões na tela.

O contador também altera a **cor do número exibido** conforme
determinados valores são atingidos.

------------------------------------------------------------------------

## 2. Objetivo

Demonstrar conceitos básicos de desenvolvimento Android:

-   Criação de interfaces com **XML**
-   Manipulação de **componentes visuais**
-   Uso de **eventos de clique**
-   Atualização dinâmica da interface
-   Organização do código em métodos

------------------------------------------------------------------------

## 3. Estrutura do Projeto

### MainActivity.java

Arquivo responsável pela **lógica do aplicativo**.

Principais responsabilidades: - Controlar o valor do contador - Capturar
cliques dos botões - Atualizar o valor exibido - Alterar a cor do
contador conforme o valor

------------------------------------------------------------------------

### activity_main.xml

Arquivo responsável pela **interface gráfica do aplicativo**.

Componentes da tela: - **TextView** para mostrar o número do contador -
**Botão de incrementar** - **Botão de decrementar**

------------------------------------------------------------------------

## 4. Funcionamento

### Inicialização

Quando o aplicativo inicia:

1.  O contador começa com valor **0**
2.  Os componentes da interface são conectados ao código Java usando
    `findViewById()`

``` java
tvContador = findViewById(R.id.tvContador);
Button btnInc = findViewById(R.id.btnIncrementar);
Button btnDec = findViewById(R.id.btnbtnDecrementar);
```

------------------------------------------------------------------------

## 5. Incremento do Contador

Quando o usuário pressiona **Incrementar (+)**:

-   O contador aumenta em **1**
-   A interface é atualizada

``` java
btnInc.setOnClickListener(v -> {
    contador++;
    atualizarInterface();
});
```

------------------------------------------------------------------------

## 6. Decremento do Contador

Quando o usuário pressiona **Decrementar (-)**:

-   O contador diminui em **1**
-   O valor **não pode ser menor que 0**

``` java
btnDec.setOnClickListener(v -> {
    if (contador > 0) {
        contador--;
        atualizarInterface();
    }
});
```

------------------------------------------------------------------------

## 7. Atualização da Interface

O método `atualizarInterface()` atualiza o valor exibido e muda a cor do
contador.

``` java
private void atualizarInterface() {
    tvContador.setText(String.valueOf(contador));

    if (contador >= 20) {
        tvContador.setTextColor(Color.MAGENTA);
    } else if (contador >= 10) {
        tvContador.setTextColor(Color.RED);
    } else {
        tvContador.setTextColor(Color.BLACK);
    }
}
```

------------------------------------------------------------------------

## 8. Regras de Cor

  Valor do Contador   Cor
  ------------------- ----------
  0 -- 9              Preto
  10 -- 19            Vermelho
  20 ou mais          Magenta

------------------------------------------------------------------------

## 9. Interface do Usuário

A interface é organizada com **LinearLayout vertical**.

### TextView

Mostra o valor do contador.

``` xml
<TextView
    android:id="@+id/tvContador"
    android:text="0"
    android:textSize="100sp"
    android:textStyle="bold"/>
```

### Botão Incrementar

``` xml
<Button
    android:id="@+id/btnIncrementar"
    android:text="Incrementar (+)" />
```

### Botão Decrementar

``` xml
<Button
    android:id="@+id/btnbtnDecrementar"
    android:text="Decrementar (-)" />
```

------------------------------------------------------------------------

## 10. Tecnologias Utilizadas

-   Java
-   Android Studio
-   Android SDK
-   XML (Layout)
-   AppCompatActivity

------------------------------------------------------------------------

## 11. Possíveis Melhorias

Algumas melhorias futuras para o projeto:

-   Botão para **resetar o contador**
-   **Animação** ao mudar o número
-   **Salvar o valor** do contador ao fechar o app
-   Interface com **Material Design**
-   Adicionar **sons nos botões**
