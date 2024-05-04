const buttonEls = document.querySelectorAll('#btn-group .btn');

buttonEls.forEach(function(buttonEl) {
  buttonEl.addEventListener('click', function() {
    const activeEl = document.querySelector('#btn-group .btn.active')
    if (activeEl) {
      activeEl.classList.remove('active')
      buttonEl.classList.add('active')
      check()
    }else {
      buttonEl.classList.add('active')
      check()
    }
  })
})



function check() {
  console.log('체크')
}



const categoryNameEls = document.querySelectorAll('section.messageBoard .container .category .categoryName')

categoryNameEls.forEach(function(categoryNameEl) {
  categoryNameEl.addEventListener('click', function() {
    const activeEl = document.querySelector('section.messageBoard .container .category .categoryName.active')
    if(activeEl) {
      activeEl.classList.remove('active')
      categoryNameEl.classList.add('active')
      check()
    }else {
      categoryNameEl.classList.add('active')
      check()
    }
  })
})



const contentsEls = document.querySelectorAll('section.messageBoard .container .contents-group .content')

contentsEls.forEach(function (contentsEl) {
  contentsEl.addEventListener('click', function () {
    check()
  })
})