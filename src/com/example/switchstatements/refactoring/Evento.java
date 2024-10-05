package com.example.switchstatements.refactoring;

public sealed interface Evento permits LoginEvento, LogoutEvento, RegistroEvento {}
