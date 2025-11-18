# GS 2 - Android Kotlin Developer

## Informações do Projeto

**Disciplina:** GS 2 – 2025 – 3SIR - 2º Semestre  
**Professor:** Ewerton Carreira  
**Aluno:** Rafael Bueno Villela  
**RM:** 550275

## Descrição

Aplicativo Android desenvolvido em Kotlin utilizando Jetpack Compose para navegação entre telas, com sistema de login, cálculo de IMC e informações da equipe.

## Funcionalidades

### 1. Tela de Login
- Campos para usuário e senha
- Validação de credenciais:
  - **Usuário:** admin
  - **Senha:** 123456
- Exibe mensagem "Usuário inválido" caso as credenciais estejam incorretas
- Navega para a tela de menu quando as credenciais estão corretas

### 2. Tela de Menu
- Botão "Cálculo de IMC" - navega para a calculadora de IMC
- Botão "Equipe" - navega para a tela de informações da equipe
- Botão "Voltar" - retorna para a tela de login

### 3. Tela de Cálculo de IMC
- Campo para inserir o nome do usuário
- Campo para inserir o peso (em kg)
- Campo para inserir a altura (em metros)
- Botão "Calcular" que realiza o cálculo do IMC
- Exibe o resultado do IMC com classificação
- Exibe o nome do usuário junto com o resultado
- Botão "Voltar" para retornar ao menu

### 4. Tela de Equipe
- Exibe os nomes dos integrantes da equipe
- Botão "Voltar" para retornar ao menu

## Prints
- Usuário incorreto
<img width="368" height="572" alt="image" src="https://github.com/user-attachments/assets/ea86f0e0-ba69-4f47-b92c-dab8a9e2e871" />

- Menu inicial
<img width="355" height="567" alt="image" src="https://github.com/user-attachments/assets/8aaa2626-1c91-4054-80e4-88da60340096" />

- Equipe
<img width="367" height="572" alt="image" src="https://github.com/user-attachments/assets/d9ca13d1-b7b0-4eda-84ef-ddcaf347c1fc" />

- Calculadora IMC funcionando
<img width="242" height="512" alt="image" src="https://github.com/user-attachments/assets/9d49d2a3-67ea-4deb-bc86-717792589f96" />

## Tecnologias Utilizadas

- **Kotlin** - Linguagem de programação
- **Jetpack Compose** - Framework de UI declarativa
- **Navigation Compose** - Navegação entre telas
- **Material Design 3** - Componentes de UI modernos

## Estrutura do Projeto

```
app/src/main/java/br/com/github/villelar/gskotlin/
├── MainActivity.kt          # Activity principal com configuração de navegação
└── screens/
    ├── LoginScreen.kt       # Tela de login
    ├── MenuScreen.kt        # Tela de menu principal
    ├── IMCScreen.kt         # Tela de cálculo de IMC
    └── EquipeScreen.kt      # Tela de informações da equipe
```

## Como Executar

1. Abra o projeto no Android Studio
2. Sincronize o Gradle
3. Execute o aplicativo em um dispositivo ou emulador Android (API 24 ou superior)

## Credenciais de Acesso

- **Usuário:** admin
- **Senha:** 123456

## Fórmula do IMC

O IMC (Índice de Massa Corporal) é calculado pela fórmula:

```
IMC = Peso (kg) / (Altura (m))²
```

### Classificação do IMC

- Abaixo de 18,5: Abaixo do peso
- 18,5 a 24,9: Peso normal
- 25,0 a 29,9: Sobrepeso
- 30,0 a 34,9: Obesidade grau I
- 35,0 a 39,9: Obesidade grau II
- 40,0 ou mais: Obesidade grau III

## Integrantes da Equipe

- **Rafael Bueno Villela** - RM: 550275

## Observações

Este projeto foi desenvolvido como parte da avaliação GS 2 da disciplina Android Kotlin Developer, seguindo as especificações fornecidas pelo professor.

