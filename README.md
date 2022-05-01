<h1 align=center> Information about the Project </h1>
<ul>
<li>This Project is a partially built project on Simple Arithmetic Game for <i>single player</i>.</li>

<li>Most of the coding part is already done, however, some clues are left in between (comments //) where students can write their codes.</li>

<li><b>matchCounter</b> will keep track of how many matches are played. A match is akin to answer one question.</li>

<li>If a player correctly answers a match, a one is added in the score array; otherwise, a zero will be added.</li>

<li>When matchCounter reaches a value 3, the sum of last three matches will be added to the <b>performance</b> array, which is initially set with -1 at all places.
For example, the performance array at the start of your app will be like [-1, -1, -1, -1, -1, -1], but after the completion of three matches let the
score array be like [1, 0, 1] then the performance array would be like [-1, -1, -1, -1, -1, 2]. Each time the performance array will be updated, the new value will
be added at the last element of the array, and all previous values will be shifted one place left. The first value will be lost, as we have to analyze the performance
  of the last six gammes only. </li>
  
  <li>The performance array will be stored in a SharedPreferences object. The SharedPreferences object is fetched at the start of the activity and an
    alert dialog is presetned to the user suggesting on his or her performance based on the last six games. </li>

  <li><b>sumOfScore</b> method should summing up the values of score array.</li>

<li>A class <b>LR</b> is also provided with this project. The LR class has a getSlope method to provide the slope fromo the given data. The data must be input to the 
<b>getSlope</b> method as a two-dimensional array (dataFrame). The first dimension will be the predictor values 1, 2, 3, 4, 5, 6 and the corresponding response values will
be performance values. The getSlope method is a static method, so you won't need to create objects of the LR class to obtain slope. Just use the name of the class LR.
  For example: LR.getSlope(dataFrame) would return a slope as a double value.</li>

<li><b>dataPrep</b> method generates a data-frame AKA two-dimensional array to be passed to the getSlope method.</li>

<li><b>getInterpretation</b> method returns a string based on the analysis of slope obtained from analysis of past six performances.</li>
</ul>
