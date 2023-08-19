document.oncopy = event =>{
    event.preventDefault();
    event.clipboardData.setData('text/plain', 'Te pille! \n');
}