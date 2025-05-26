form.addEventListener('submit', e => {  
  e.preventDefault();  
  const name = form.elements.name.value;  
  if (!name) showError("Name required");
});
