package com.hnc.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hnc.R
import com.hnc.ui.theme.*


@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isPasswordOpen by remember { mutableStateOf(false) }
    Box(contentAlignment = Alignment.TopCenter) {
        Image(
            painter = painterResource(id = R.drawable.group), contentDescription = "",
            modifier = Modifier.fillMaxWidth()
        )
    }


    Box(contentAlignment = Alignment.BottomCenter) {
        Image(
            painter = painterResource(id = R.drawable.group_dark), contentDescription = "",
            modifier = Modifier.fillMaxWidth()
        )
    }

    Box(contentAlignment = Alignment.BottomCenter) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 100.dp),
                backgroundColor = Color.Black,
                elevation = 0.dp,
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Black,
                            Color.Transparent
                        )
                    )
                )) {
                    Text(
                        text = "Login To Your Account",
                        color = LightPrimaryColor,
                        fontFamily = RalewayThin,
                        letterSpacing = 1.sp,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(top = 26.dp)
                    )

                    OutlinedTextField(
                        value = email, onValueChange = {
                            email = it
                        },
                        label = {
                            Text(text = "Email Address", color = IconColor,fontFamily = RalewayRegular)
                        },
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 50.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            unfocusedBorderColor = EdtBg,
                            textColor = FocusColor

                        ),
                        keyboardOptions = KeyboardOptions(
                            keyboardType =
                            KeyboardType.Email
                        ),
                        singleLine = true,
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_email),
                                contentDescription = "",
                                tint = IconColor,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    )

                    OutlinedTextField(
                        value = password, onValueChange = {
                            password = it
                        },
                        label = {
                            Text(text = "Password", color = IconColor,fontFamily = RalewayRegular)
                        },
                        shape = RoundedCornerShape(25.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 10.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            unfocusedBorderColor = EdtBg,
                            textColor = FocusColor
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        singleLine = true,
                        visualTransformation = if (!isPasswordOpen) PasswordVisualTransformation() else VisualTransformation.None,
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_password),
                                contentDescription = "",
                                tint = IconColor,
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        trailingIcon = {
                            IconButton(onClick = { isPasswordOpen = !isPasswordOpen }) {
                                if (!isPasswordOpen) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_eye_open),
                                        contentDescription = "",
                                        tint = EdtBg,
                                        modifier = Modifier.size(24.dp)
                                    )
                                } else {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_eye_close),
                                        contentDescription = "",
                                        tint = PrimaryColor,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            }
                        }
                    )

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(top = 30.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = SecondaryColor,
                            contentColor = Color.White
                        ),
                        contentPadding = PaddingValues(vertical = 14.dp)
                    ) {

                        Text(text = "LOGIN", fontFamily = RalewayRegular)
                    }


                    TextButton(
                        onClick = {},
                        contentPadding = PaddingValues(vertical = 0.dp)
                    ) {
                        Text(
                            text = "Forgot Password ?",
                            color = Color.Red,
                            fontFamily = RalewayRegular,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 26.dp)
                        )
                    }
                    TextButton(
                        onClick = {},
                        contentPadding = PaddingValues(vertical = 0.dp)
                    ) {
                        Text(
                            text = "Don't have an Account ? Sign Up",
                            color = LightPrimaryColor,
                            fontFamily = RalewayRegular,
                            fontSize = 12.sp,
                            modifier = Modifier.padding(top = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }
    }

}