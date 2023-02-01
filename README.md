# D2SGateway
The main part of the D2S = Dota2Services project which purpose is to rewrite ProDB monolith as group of microservices

Currently ready:

  * [D2SHistory](https://github.com/Gab-ani/D2SHistory) - a microservice operating the database storing matches data. Its only use is literally manage DB and save/retrieve data, if some part of the system needs it.
  * [D2SHistoryFiller](https://github.com/Gab-ani/D2SHistoryFiller) and its secondary services: [D2SProtrackerParser](https://github.com/Gab-ani/D2SProtrackerParser) and [D2StratzParser](https://github.com/Gab-ani/D2StratzParser). 
      - D2SStratzParser is a service dedicated to request data from [stratz.com](https://stratz.com/) through its public API.
      - D2SProtrackerParser is a service dedicated to decide which matches are we going to request from [stratz.com](https://stratz.com/). D2SProtrackerParser currently doesn't operate as intended due to some [protracker's](https://www.dota2protracker.com) failures(redesign?) and is being reimagined. You can check the  D2SProtrackerParser's repository readme file for details.
      - D2SHistoryFiller is a manager services used to organise the process of sending new data in the database.
  * [D2SAnalyser](https://github.com/Gab-ani/D2SAnalyser) - a microservice dedicated to process matches data from history to something useful. Currently has functional of requesting a chunk of match data by two dates - the start and the end of the period. This data processed into an array of heroes matchups - logical structure used to predict a match outcome, given two teams and a name of wheighted ratio selection. You can check the  D2SAnalyser's repository readme file for details.


The scheme below is outdated
![изображение](https://user-images.githubusercontent.com/25298003/215287639-e6bb26d6-2407-436a-9e36-9c135587cad6.png)

