# Mini Navegador Web com JavaFX

Aplicação desktop simples que funciona como um mini navegador web usando JavaFX.

![Demonstração do Mini Navegador Web](./assets/mini-navegador-web.gif)

## Repositório

[mini-navegador-web](https://github.com/p-rcorreia/mini-navegador-web.git)

## Objetivo

Criar um navegador básico com campo para digitar uma URL e uma área de visualização de páginas web.

## Conceitos praticados

- JavaFX
- `Application`
- `Stage`
- `Scene`
- `TextField`
- `VBox`
- `WebView`
- `WebEngine`
- Evento com `setOnAction`
- Carregamento de páginas com `load`
- Tratamento simples de URL com `startsWith`
- Uso do módulo `javafx.web`
- Dependências transitivas entre módulos JavaFX

## Funcionalidades

- Permite digitar uma URL em um campo de texto.
- Carrega a página ao pressionar Enter.
- Exibe o conteúdo web dentro de um `WebView`.
- Adiciona `http://` quando a URL não começa com `http://` ou `https://`.

## Como executar

Na pasta do projeto:

```powershell
javac --module-path "$env:PATH_TO_FX" --add-modules javafx.web MiniBrowser.java
java --module-path "$env:PATH_TO_FX" --add-modules javafx.web MiniBrowser
```

## Status

Concluído.
