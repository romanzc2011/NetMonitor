import React from "react"
import { Box, Flex, Image, Text } from "@chakra-ui/react"
import CWMCSLogo from "../assets/CWCS_Logo.png"

export default function Header() {
  return (
    <Box
      bgGradient="to-r"
      gradientFrom="rgb(20, 3, 255)"
      gradientTo="rgb(31, 147, 255)"
      width="100%"
    >
      <Flex
        align="center"
        gap={2}
        px={4}
        py={2}
      >
        <Image
          src={CWMCSLogo}
          alt="CWCMS"
          height="60px"
          width="auto"
          bg="white"
          borderRadius="md"
          p={0.5}
        />

        <Text
          fontSize="xl"
          fontWeight="bold"
          color="white"
          letterSpacing="1px"
        >
          Contractor Workplace Compliance Management System
        </Text>
      </Flex>
    </Box>
  )
}