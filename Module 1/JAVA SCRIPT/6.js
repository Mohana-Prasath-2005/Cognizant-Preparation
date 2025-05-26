events.push(newEvent);  
const musicEvents = events.filter(e => e.category === 'Music');  
const displayCards = events.map(e => `${e.type}: ${e.name}`);
