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
- utilizar redis reactive com mutiny no operation service
- instalar o kafka
````
helm install kafka bitnami/kafka --set replicaCount=2 --set numPartitions=9


## Spring cloud stream
- ponto importante, caso tenha mais de um consumer, devemos definir nossas functions, conforme abaixo:

````
spring:
  kafka:
    bootstrap-servers:
      - localhost:9092
    consumer:
      auto-offset-reset: earliest
    listener:
      missing-topics-fatal: false
  cloud:
    function:
      definition: updateWithdraw;transactionAutorize
````
