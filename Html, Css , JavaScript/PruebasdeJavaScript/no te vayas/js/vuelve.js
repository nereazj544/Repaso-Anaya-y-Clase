let previousTitle = document.title

// esto es para que cambie el titulo de la pagina
window.addEventListener('blur', () => {
    previousTitle = document.title
    document.title = '¡No te vayas vuelve! 🥹'
})

// esto lo que hara es volver al titulo original del archivo

window.addEventListener('focus', () => {
    document.title = previousTitle
})