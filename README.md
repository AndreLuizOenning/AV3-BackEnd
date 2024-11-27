* Endpoint: Criar Jogador
URL: /players
Método: POST
Descrição: Cria um novo jogador.

Corpo da requisição:
{
  "nickname": "Summoner1",
  "role": "ADC"
}

resposta:
{
  "id": 1,
  "nickname": "Summoner1",
  "role": "ADC"
}


*Pesquisar Jogador: 
URL: /players/{nickname}
Método: GET
Descrição: Obtém os detalhes de um jogador pelo ID.
Resposta:{
  "id": 1,
  "nickname": "Summoner1",
  "role": "ADC"
}


*Deletar Jogador
URL:/players/{nickname}
Método: DELETE
Descrição:deleta um player
Resposta:204(No content)

*Criar Partida
URL:/matches
Método:POST
Descrição:Cria uma partida

Requisição:{
  "player": "Summoner1234",
  "kills": 10,
  "deaths": 3,
  "assists": 5,
  "cs": 200,
  "goldEarned": 15000,
  "result": "Win"
}

resposta:{
    "id": 1,
    "result": "Win"
}

*Acessar uma partida
URL:/matches/{id}
Método:GET
Descrição:Lista as informações de uma partida

{
    "id": 1,
    "result": "Win",
    "date": {data},
    "player": "André"
}


*Deletar Partida
URL:/matches/{id}
Método: DELETE
Descrição:deleta uma partida
Resposta:204(No content)


* Endpoint: Criar Estatisticas
URL: /player-stats
Método: POST
Descrição: Cria quadro de estatíticas.

Corpo da requisição:
{
  "nickname": "string",
  "kda": 4.5,
  "winRate": 60.0,
  "csPerMinute": 8.2,
  "goldPerMinute": 450.0
}
resposta:
{
  "id": 1,
  "nickname": "player1",
  "kda": 4.5,
  "winRate": 60.0,
  "csPerMinute": 8.2,
  "goldPerMinute": 450.0
}

*Buscar Estatísticas por Id
URL: /player-stats/{Id}
Método:GET
desc: Busca os jogadores pelo nome
resposta:{
  "id": 1,
  "nickname": "player1",
  "kda": 4.5,
  "winRate": 60.0,
  "csPerMinute": 8.2,
  "goldPerMinute": 450.0
}

*Atualizar Estatísticas do Jogador
URL:/player-stats/{Id}
Método:PUT
desc: Atualiza jogadores pelo id

Requisição:{
  "kda": 5.2,
  "winRate": 65.0,
  "csPerMinute": 9.0,
  "goldPerMinute": 470.0
}

resposta:{
  "id": 1,
  "nickname": "player1",
  "kda": 5.2,
  "winRate": 65.0,
  "csPerMinute": 9.0,
  "goldPerMinute": 470.0
}

*Deletar Estatísticas do Jogador
URL:/player-stats/{Id}
Método:DELETE
desc: Deleta jogadores pelo id
# AV3-BackEnd
