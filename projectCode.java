let List1=['Arjun','Adwait','Swapnil','Amit','Vishal','Adnan']
let List2=['Adwait','Laxman','Amit','Adnan','Nitin','Gaurav']
const uniqueSetOfList1=[]
const uniqueSetOfList2=[]
const uniqueSetOfList1AndSet2=[]
for (let name of List1){
    if (List2.includes(name)){
        continue;
    }else{
        uniqueSetOfList1.push(name)
    }
}
for (let name of List2){
    if (List1.includes(name)){
        continue;
    }else{
        uniqueSetOfList2.push(name)
    }
}
for (let name of List1){
    if (List2.includes(name)){
        uniqueSetOfList1AndSet2.push(name)
    }
}
console.log(uniqueSetOfList1)
console.log(uniqueSetOfList2)
console.log(uniqueSetOfList1AndSet2)
