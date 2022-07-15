# arquitetura-reactor-v2
- a fazer: utilizar o workflow do github e entregar as apps via argocd no kubernetes
- app participantes:
  - https://github.com/fabriciolfj/engine-rule-service
    - mudar a regra do score, onde receberá o cpf do cliente e consultará outro microservice para pegar o score (utilizar grpc)
  - https://github.com/fabriciolfj/account-service-webflux 
  - https://github.com/fabriciolfj/operation-service será feito utilizando mutiny
- todo: montar cluster kubernetes local, via terraform
- gitops para entrega das apps, junto ao argocd
- utilizar o redisson dentro de account para cache em relação ao rules
