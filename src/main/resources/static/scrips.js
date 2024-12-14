const perguntas = [
    {
        id: 1,
        enunciado: "Qual é a capital do Brasil?",
        alternativas: [
            'Rio de Janeiro',
            'Brasília',
            'São Paulo',
            'Salvador'
        ]
    },
    {
        id: 2,
        enunciado: "Qual é o maior planeta do sistema solar?",
        alternativas: [
            'Júpiter',
            'Saturno',
            'Terra',
            'Marte'
        ]
    },
    {
        id: 3,
        enunciado: "Quem escreveu 'Dom Casmurro'?",
        alternativas: [
            'José de Alencar',
            'Machado de Assis',
            'Monteiro Lobato',
            'Clarice Lispector'
        ]
    },
    // Adicione o resto das perguntas aqui...
];

// Função para preencher as alternativas no formulário
function carregarPergunta(perguntaId) {
    const pergunta = perguntas.find(p => p.id === perguntaId);
    console.log("deu certo")
    if (pergunta) {
        const perguntaElement = document.getElementById("pergunta");
        perguntaElement.textContent = pergunta.enunciado;

        const alternativasElement = document.getElementById("alternativas");
        alternativasElement.innerHTML = "";  // Limpar alternativas anteriores

        pergunta.alternativas.forEach((alternativa, idx) => {
            const li = document.createElement('li');

            const radio = document.createElement('input');
            radio.type = "radio";
            radio.name = "resposta";
            radio.value = idx;
            radio.id = "alt" + idx;

            const label = document.createElement('label');
            label.setAttribute("for", "alt" + idx);
            label.textContent = alternativa;

            li.appendChild(radio);
            li.appendChild(label);

            alternativasElement.appendChild(li);
        });

        // Preencher o campo oculto com o ID da pergunta
        document.getElementById("perguntaId").value = perguntaId;
    }
}

// Carregar a pergunta desejada
document.addEventListener('DOMContentLoaded', () => {
    const perguntaId = 1;  // Substitua pelo ID da pergunta que você quer carregar
    carregarPergunta(perguntaId);
});





















































