const buttonEls = document.querySelectorAll('#btn-group .btn');
const ActiveCategoryEl = document.querySelector('section.messageBoard .container .category .categoryName.active')
const categoryNameEls = document.querySelectorAll('section.messageBoard .container .category .categoryName')



// if(!ActiveCategoryEl) {
//   categoryNames = Array.from(categoryNameEls)
//   categoryNames[0].classList.add('active')
// }

buttonEls.forEach(function(buttonEl) {
  buttonEl.addEventListener('click', function() {
    const activeEl = document.querySelector('#btn-group .btn.active')
    if (activeEl) {
      activeEl.classList.remove('active')
      buttonEl.classList.add('active')
      console.log(buttonEl.innerText)
    }else {
      buttonEl.classList.add('active')
      console.log(buttonEl.innerText)
    }
  })
})



function check() {
  console.log('체크')
}





categoryNameEls.forEach(function(categoryNameEl) {
  categoryNameEl.addEventListener('click', function() {
    const activeEl = document.querySelector('section.messageBoard .container .category .categoryName.active')
    if(activeEl) {
      activeEl.classList.remove('active')
      categoryNameEl.classList.add('active')
      console.log(categoryNameEl.innerText)
    }else {
      categoryNameEl.classList.add('active')
      console.log(categoryNameEl.innerText)
    }
  })
})



const contentsEls = document.querySelectorAll('section.messageBoard .container .contents-group .content')

contentsEls.forEach(function (contentsEl) {
  contentsEl.addEventListener('click', function () {
    // check()
    window.location.href = "/post";
  })
})


function beforeActive() {
  const activeButton = document.querySelector('#btn-group .btn.active')
  const buttonArray =  Array.from(buttonEls);
  const targetButton = buttonArray.find(function(button) {
    return Number(button.innerText) === Number(activeButton.innerText) - 1;
  })
  if(targetButton) {
    activeButton.classList.remove('active')
    targetButton.classList.add('active')
  } else {
    console.log('해당값없음')
  }
  
  
  
  // console.log(activeButton.innerText - 1)
}
function nextActive() {
  const activeButton = document.querySelector('#btn-group .btn.active')
  const buttonArray =  Array.from(buttonEls);
  const targetButton = buttonArray.find(function(button) {
    return Number(button.innerText) === Number(activeButton.innerText) + 1;
  })
  
  if(targetButton) {
    activeButton.classList.remove('active')
    targetButton.classList.add('active')
  }else {
    console.log('해당값 없음')
  }
  

  // console.log(targetButton)
  // console.log(Number(activeButton.innerText) + 1)
}
function firstActive() {
  let ButtonText = []
  const buttonArray =  Array.from(buttonEls);
  buttonArray.forEach(function(Button) {
    ButtonText.push(Button.innerText)
  })
  const targetButton = buttonArray.find(function(button) {
    return Number(button.innerText) === Math.min(...ButtonText);
  })

  if(targetButton) {
    const activeButton = document.querySelector('#btn-group .btn.active')
    activeButton.classList.remove('active')
    targetButton.classList.add('active')
  }else{
    console.log('해당값 없음')
  }

}
function lastActive() {
  let ButtonText = []
  const buttonArray =  Array.from(buttonEls);
  buttonArray.forEach(function(Button) {
    ButtonText.push(Button.innerText)
  })
  const targetButton = buttonArray.find(function(button) {
    return Number(button.innerText) === Math.max(...ButtonText);
  })

  if(targetButton) {
    const activeButton = document.querySelector('#btn-group .btn.active')
    activeButton.classList.remove('active')
    targetButton.classList.add('active')
  }else{
    console.log('해당값 없음')
  }

}