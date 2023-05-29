function home(){
    window.location.href = "./welcome.html"
}

function mainmenu(){
    window.location.href = "./manageroption.html"
}


function nameCheck() {
    let name = document.getElementById("name").value;
    const alphabeticRegex = /^[a-zA-Z]+$/;
  if (alphabeticRegex.test(name)){
        document.getElementById("reName").innerHTML = " ";
    }
    else{
        document.getElementById("reName").innerHTML = "Enter alphabets";
    }

    const inputField = document.getElementById("name");

inputField.addEventListener("input", () => {
  if (/[^a-zA-Z]/.test(inputField.value)) {
    inputField.value = inputField.value.replace(/[^a-zA-Z]/g, "");
  }
  if (inputField.value.length > 20) {
    inputField.value = inputField.value.slice(0, 20);
  }
});

inputField.addEventListener("paste", (event) => {
  const clipboardText = event.clipboardData.getData("text/plain");
  if (/[^a-zA-Z]/.test(clipboardText) || clipboardText.length > 20) {
    event.preventDefault();
    const filteredText = clipboardText.replace(/[^a-zA-Z]/g, "").slice(0, 20);
    document.execCommand("insertText", false, filteredText);
  }
});

inputField.addEventListener("keydown", (event) => {
  if (inputField.value.length >= 20 && event.keyCode !== 8) {
    event.preventDefault();
  }
  if (/[^a-zA-Z]/.test(event.key)) {
    event.preventDefault();
  }
});
}
function mobCheck() {
    let number = document.getElementById("mobile").value;
    if (!isNaN(number) && number.toString().length === 10){
        document.getElementById("remob").innerHTML = " ";
    }else{
        document.getElementById("remob").innerHTML = "invalid mobile number";
    }
}
function jobcheck() {
    let name = document.getElementById("job").value;
    const alphabeticRegex = /^[a-zA-Z]+$/;
  if (alphabeticRegex.test(name)){
        document.getElementById("rejob").innerHTML = " ";
    }
    else{
        document.getElementById("rejob").innerHTML = "Enter alphabets";
    }

    const inputField = document.getElementById("job");

inputField.addEventListener("input", () => {
  if (/[^a-zA-Z]/.test(inputField.value)) {
    inputField.value = inputField.value.replace(/[^a-zA-Z]/g, "");
  }
  if (inputField.value.length > 20) {
    inputField.value = inputField.value.slice(0, 20);
  }
});

inputField.addEventListener("paste", (event) => {
  const clipboardText = event.clipboardData.getData("text/plain");
  if (/[^a-zA-Z]/.test(clipboardText) || clipboardText.length > 20) {
    event.preventDefault();
    const filteredText = clipboardText.replace(/[^a-zA-Z]/g, "").slice(0, 20);
    document.execCommand("insertText", false, filteredText);
  }
});

inputField.addEventListener("keydown", (event) => {
  if (inputField.value.length >= 20 && event.keyCode !== 8) {
    event.preventDefault();
  }
  if (/[^a-zA-Z]/.test(event.key)) {
    event.preventDefault();
  }
});
}

function fjobcheck() {
    let name = document.getElementById("fjob").value;
    const alphabeticRegex = /^[a-zA-Z]+$/;
  if (alphabeticRegex.test(name)){
        document.getElementById("refjob").innerHTML = " ";
    }
    else{
        document.getElementById("refjob").innerHTML = "Enter alphabets";
    }

    const inputField = document.getElementById("fjob");

inputField.addEventListener("input", () => {
  if (/[^a-zA-Z]/.test(inputField.value)) {
    inputField.value = inputField.value.replace(/[^a-zA-Z]/g, "");
  }
  if (inputField.value.length > 20) {
    inputField.value = inputField.value.slice(0, 20);
  }
});

inputField.addEventListener("paste", (event) => {
  const clipboardText = event.clipboardData.getData("text/plain");
  if (/[^a-zA-Z]/.test(clipboardText) || clipboardText.length > 20) {
    event.preventDefault();
    const filteredText = clipboardText.replace(/[^a-zA-Z]/g, "").slice(0, 20);
    document.execCommand("insertText", false, filteredText);
  }
});

inputField.addEventListener("keydown", (event) => {
  if (inputField.value.length >= 20 && event.keyCode !== 8) {
    event.preventDefault();
  }
  if (/[^a-zA-Z]/.test(event.key)) {
    event.preventDefault();
  }
});
}

function nativecheck() {
    let name = document.getElementById("native").value;
    const alphabeticRegex = /^[a-zA-Z]+$/;
  if (alphabeticRegex.test(name)){
        document.getElementById("renative").innerHTML = " ";
    }
    else{
        document.getElementById("renative").innerHTML = "Enter alphabets";
    }

    const inputField = document.getElementById("native");

inputField.addEventListener("input", () => {
  if (/[^a-zA-Z]/.test(inputField.value)) {
    inputField.value = inputField.value.replace(/[^a-zA-Z]/g, "");
  }
  if (inputField.value.length > 20) {
    inputField.value = inputField.value.slice(0, 20);
  }
});

inputField.addEventListener("paste", (event) => {
  const clipboardText = event.clipboardData.getData("text/plain");
  if (/[^a-zA-Z]/.test(clipboardText) || clipboardText.length > 20) {
    event.preventDefault();
    const filteredText = clipboardText.replace(/[^a-zA-Z]/g, "").slice(0, 20);
    document.execCommand("insertText", false, filteredText);
  }
});

inputField.addEventListener("keydown", (event) => {
  if (inputField.value.length >= 20 && event.keyCode !== 8) {
    event.preventDefault();
  }
  if (/[^a-zA-Z]/.test(event.key)) {
    event.preventDefault();
  }
});
}

function monthscheck() {
const inputField = document.getElementById("months");

inputField.addEventListener("input", () => {
  const userInput = parseInt(inputField.value);
  if (isNaN(userInput) || userInput < 10 || userInput > 99) {
    document.getElementById("remonths").innerHTML = "Enter  valid number";
    }
    else{
        document.getElementById("remonths").innerHTML = " ";
    }
});
}

function agecheck() {
    const inputField = document.getElementById("age");
    
    inputField.addEventListener("input", () => {
      const userInput = parseInt(inputField.value);
      if (isNaN(userInput) || userInput < 10 || userInput > 99) {
        document.getElementById("reage").innerHTML = "Enter valid number";
    }
    else{
        document.getElementById("reage").innerHTML = " ";
    }
    });
    }

function rentcheck(){
    const inputField = document.getElementById("rent");
    const pattern = /^\d{0,5}$/;
    
    inputField.addEventListener("input", () => {
      const userInput = inputField.value;
      if (!pattern.test(userInput)) {
        document.getElementById("rerent").innerHTML = "Enter valid rent 5 digit";
    }
    else{
        document.getElementById("rerent").innerHTML = " ";
    }
    });}

    function advancecheck(){
        const inputField = document.getElementById("advance");
        const pattern = /^\d{0,5}$/;
        
        inputField.addEventListener("input", () => {
          const userInput = inputField.value;
          if (!pattern.test(userInput)) {
            document.getElementById("readvance").innerHTML = "Enter valid rent 5 digit";
        }
        else{
            document.getElementById("readvance").innerHTML = " ";
        }
        });}
    
    function eidcheck(){
    const inputElement = document.getElementById("eid"); // replace "input-element-id" with the actual ID of your input element

    inputElement.addEventListener("input", function() {
      const alphanumericRegex = /^[a-zA-Z0-9]+$/; // regular expression to match alphanumeric characters
      const inputValue = inputElement.value;
      
      if (!inputValue.match(alphanumericRegex) || inputValue.length > 20) {
        inputElement.value = inputValue.slice(0, 20).replace(/[^a-zA-Z0-9]/g, ''); // remove non-alphanumeric characters and limit to 20 characters
      }
    });
    }
    function epasswordcheck(){
    const inputElement = document.getElementById("epassword"); // Replace "input-element-id" with the actual ID of your input element
    const maxLength = 8; // Set the maximum allowed length

    inputElement.addEventListener("input", function() {
      const alphanumericRegex = /^[a-zA-Z0-9]+$/; // Regular expression to match alphanumeric characters
      const inputValue = inputElement.value;

      if (!inputValue.match(alphanumericRegex)) {
        inputElement.value = inputValue.replace(/[^a-zA-Z0-9]/g, ''); // Remove non-alphanumeric characters
      }
      
      if (inputValue.length > maxLength) {
        inputElement.value = inputValue.slice(0, maxLength); // Truncate the value to the maximum allowed length
      }
    });
    }
    function nidcheck(){
    const inputElement = document.getElementById("nid"); // replace "input-element-id" with the actual ID of your input element

    inputElement.addEventListener("input", function() {
      const alphanumericRegex = /^[a-zA-Z0-9]+$/; // regular expression to match alphanumeric characters
      const inputValue = inputElement.value;
      
      if (!inputValue.match(alphanumericRegex) || inputValue.length > 20) {
        inputElement.value = inputValue.slice(0, 20).replace(/[^a-zA-Z0-9]/g, ''); // remove non-alphanumeric characters and limit to 20 characters
      }
    });}
    
    function npasswordcheck(){
    const inputElement = document.getElementById("npassword"); // Replace "input-element-id" with the actual ID of your input element
    const maxLength = 8; // Set the maximum allowed length

    inputElement.addEventListener("input", function() {
      const alphanumericRegex = /^[a-zA-Z0-9]+$/; // Regular expression to match alphanumeric characters
      const inputValue = inputElement.value;

      if (!inputValue.match(alphanumericRegex)) {
        inputElement.value = inputValue.replace(/[^a-zA-Z0-9]/g, ''); // Remove non-alphanumeric characters
      }
      
      if (inputValue.length > maxLength) {
        inputElement.value = inputValue.slice(0, maxLength); // Truncate the value to the maximum allowed length
      }
    });}

    function namecheck(){
        const inputElement = document.getElementById("nam"); // replace "input-element-id" with the actual ID of your input element

        inputElement.addEventListener("input", function() {
          const alphanumericRegex = /^[a-zA-Z0-9]+$/; // regular expression to match alphanumeric characters
          const inputValue = inputElement.value;
          
          if (!inputValue.match(alphanumericRegex) || inputValue.length > 20) {
            inputElement.value = inputValue.slice(0, 20).replace(/[^a-zA-Z0-9]/g, ''); // remove non-alphanumeric characters and limit to 20 characters
          }
        });
        }
    function passcheck(){
        const inputElement = document.getElementById("pass"); // Replace "input-element-id" with the actual ID of your input element
        const maxLength = 8; // Set the maximum allowed length

        inputElement.addEventListener("input", function() {
          const alphanumericRegex = /^[a-zA-Z0-9]+$/; // Regular expression to match alphanumeric characters
          const inputValue = inputElement.value;

          if (!inputValue.match(alphanumericRegex)) {
            inputElement.value = inputValue.replace(/[^a-zA-Z0-9]/g, ''); // Remove non-alphanumeric characters
          }
          
          if (inputValue.length > maxLength) {
            inputElement.value = inputValue.slice(0, maxLength); // Truncate the value to the maximum allowed length
          }
        });}
    
    function searchcheck(){
        const inputElement = document.getElementById("search"); // replace "input-element-id" with the actual ID of your input element

        inputElement.addEventListener("input", function() {
          const alphanumericRegex = /^[a-zA-Z0-9]+$/; // regular expression to match alphanumeric characters
          const inputValue = inputElement.value;
          
          if (!inputValue.match(alphanumericRegex) || inputValue.length > 20) {
            inputElement.value = inputValue.slice(0, 20).replace(/[^a-zA-Z0-9]/g, ''); // remove non-alphanumeric characters and limit to 20 characters
          }
        });}
 
    function termscheck(){
    	
    	 const textArea = document.getElementById("myTextarea");
    	  const wordCount = document.getElementById("wordCount");

    	  // Add an input event listener to the text area
    	  textArea.addEventListener("input", () => {
    	    // Get the input text and split it into words
    	    const inputText = textArea.value.trim();
    	    const words = inputText.split(/\s+/);

    	    // Check the number of words and their validity
    	    let validWordsCount = 0;
    	    for (const word of words) {
    	      if (/^[a-zA-Z0-9!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]*$/.test(word)) {
    	        validWordsCount++;
    	      }
    	    }
    	    if (validWordsCount > 20) {
    	      // If there are more than 20 valid words, truncate the input
    	      const truncatedInput = words.slice(0, 20).join(" ");
    	      textArea.value = truncatedInput;
    	      wordCount.textContent = "You can only enter up to 20 valid words.";
    	    } 
    	  });
    }
    
    function tenantcheck(){
        const inputElement = document.getElementById("tenant"); // replace "input-element-id" with the actual ID of your input element

        inputElement.addEventListener("input", function() {
          const alphanumericRegex = /^[a-zA-Z0-9]+$/; // regular expression to match alphanumeric characters
          const inputValue = inputElement.value;
          
          if (!inputValue.match(alphanumericRegex) || inputValue.length > 20) {
            inputElement.value = inputValue.slice(0, 20).replace(/[^a-zA-Z0-9]/g, ''); // remove non-alphanumeric characters and limit to 20 characters
          }
        });
        }
    function cotnocheck(){
        const inputElement = document.getElementById("cotno"); // Replace "input-element-id" with the actual ID of your input element
        const maxLength = 8; // Set the maximum allowed length

        inputElement.addEventListener("input", function() {
          const alphanumericRegex = /^[a-zA-Z0-9]+$/; // Regular expression to match alphanumeric characters
          const inputValue = inputElement.value;

          if (!inputValue.match(alphanumericRegex)) {
            inputElement.value = inputValue.replace(/[^a-zA-Z0-9]/g, ''); // Remove non-alphanumeric characters
          }
          
          if (inputValue.length > maxLength) {
            inputElement.value = inputValue.slice(0, maxLength); // Truncate the value to the maximum allowed length
          }
        });}
    
    