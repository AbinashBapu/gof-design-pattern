# GOF Design Pattern 
 Describes Design Pattern of Gang of Four Using Java 

### SRP (Single responsibility principle) 
- Created Journal and Persistence 2 classes. 
- Journal is responsible to do crud related journal. This file is not responsible to do any operation related to persistence. 
If we do so then we are following anti pattern.
Hence our Journal and Persistence 2 classes keeping the things of their related work.
- <b>NB</b>: I have made persistence as abstract because i didn't do anything. so kept it. ideally this file will contain the logic
related to file read write thing
- Class File: ```SingleResponsibilityPrincipleApplication```